package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.DropboxLogoThin: ImageVector
    get() {
        if (_DropboxLogoThin != null) {
            return _DropboxLogoThin!!
        }
        _DropboxLogoThin = ImageVector.Builder(
            name = "Thin.DropboxLogoThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
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
                strokeLineWidth = 8f,
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
                strokeLineWidth = 8f,
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
                strokeLineWidth = 8f,
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
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104.11f, 211.46f)
                lineToRelative(23.89f, 16.54f)
                lineToRelative(23.89f, -16.54f)
            }
        }.build()

        return _DropboxLogoThin!!
    }

@Suppress("ObjectPropertyName")
private var _DropboxLogoThin: ImageVector? = null
