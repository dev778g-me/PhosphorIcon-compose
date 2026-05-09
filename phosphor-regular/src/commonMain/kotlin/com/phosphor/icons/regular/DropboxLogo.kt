package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.DropboxLogo: ImageVector
    get() {
        if (_DropboxLogo != null) {
            return _DropboxLogo!!
        }
        _DropboxLogo = ImageVector.Builder(
            name = "Regular.DropboxLogo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(76f, 48f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 48f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(76f, 120f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(180f, 120f)
                lineToRelative(-52f, 36f)
                lineToRelative(52f, 36f)
                lineToRelative(52f, -36f)
                lineToRelative(-52f, -36f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104.11f, 211.46f)
                lineToRelative(23.89f, 16.54f)
                lineToRelative(23.89f, -16.54f)
            }
        }.build()

        return _DropboxLogo!!
    }

@Suppress("ObjectPropertyName")
private var _DropboxLogo: ImageVector? = null
