/*****************************************************************************
 * Project:  HtmlGrapheas
 * Purpose:  HTML text editor library
 * Author:   NikitaFeodonit, nfeodonit@yandex.com
 *****************************************************************************
 *   Copyright (c) 2017-2018 NikitaFeodonit
 *
 *    This file is part of the HtmlGrapheas project.
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published
 *    by the Free Software Foundation, either version 3 of the License,
 *    or (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *    See the GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program. If not, see <http://www.gnu.org/licenses/>.
 ****************************************************************************/

package ru.htmlgrapheas.htmlgrapheasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import ru.htmlgrapheas.htmlgrapheaskamva.HtmlGrapheasView;
import ru.nfeotools.alogstd.AndroidLogcatStdoutsJni;


public class MainActivity
    extends AppCompatActivity
{
  private HtmlGrapheasView mMainView;

  @Override
  protected void onCreate(Bundle savedInstanceState)
  {
    super.onCreate(savedInstanceState);

    AndroidLogcatStdoutsJni.init("HtmlGrapheas", "-Hg--");

    mMainView = new HtmlGrapheasView(this);
    setContentView(mMainView);
  }
}
