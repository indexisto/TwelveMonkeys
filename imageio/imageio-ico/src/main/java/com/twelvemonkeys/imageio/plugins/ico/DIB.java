/*
 * Copyright (c) 2009, Harald Kuhr
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name "TwelveMonkeys" nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.twelvemonkeys.imageio.plugins.ico;

/**
 * DIB
 *
 * @author <a href="mailto:harald.kuhr@gmail.com">Harald Kuhr</a>
 * @author last modified by $Author: haraldk$
 * @version $Id: DIB.java,v 1.0 Apr 8, 2008 1:43:04 PM haraldk Exp$
 *
 * @see <a href="http://en.wikipedia.org/wiki/BMP_file_format">BMP file format (Wikipedia)</a>
 * @see <a href="http://en.wikipedia.org/wiki/ICO_(icon_image_file_format)">ICO file format (Wikipedia)</a>
 */
interface DIB {
    int TYPE_UNKNOWN = 0;
    int TYPE_ICO = 1;
    int TYPE_CUR = 2;

    /** BITMAPCOREHEADER size, OS/2 V1 */
    int OS2_V1_HEADER_SIZE = 12;

    /** BITMAPCOREHEADER size, OS/2 V2 */
    int OS2_V2_HEADER_SIZE = 64;

    /**
     * BITMAPINFOHEADER size, Windows 3.0 and later.
     * This is the most commonly used header for persistent bitmaps
     */
    int WINDOWS_V3_HEADER_SIZE = 40;

    /** BITMAPV4HEADER size, Windows 95/NT4 and later */
    int WINDOWS_V4_HEADER_SIZE = 108;

    /** BITMAPV5HEADER size, Windows 98/2000 and later */
    int WINDOWS_V5_HEADER_SIZE = 124;

    /** PNG "magic" identifier */
    long PNG_MAGIC = 0x89l << 56 | (long) 'P' << 48 | (long) 'N' << 40 | (long) 'G' << 32 | 0x0dl << 24 | 0x0al << 16 | 0x1al << 8 | 0x0al;
}
