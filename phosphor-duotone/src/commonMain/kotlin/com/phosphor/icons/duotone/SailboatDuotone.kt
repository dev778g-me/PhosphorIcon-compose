package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.SailboatDuotone: ImageVector
    get() {
        if (_SailboatDuotone != null) {
            return _SailboatDuotone!!
        }
        _SailboatDuotone = ImageVector.Builder(
            name = "Duotone.SailboatDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(16f, 176f)
                horizontalLineTo(240f)
                lineToRelative(-29.6f, 37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.24f, 3f)
                horizontalLineTo(51.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.24f, -3f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(136f, 8f)
                lineToRelative(-104f, 128f)
                lineToRelative(104f, 0f)
                lineToRelative(0f, -128f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 176f)
                horizontalLineTo(240f)
                lineToRelative(-29.6f, 37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.24f, 3f)
                horizontalLineTo(51.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.24f, -3f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 136f)
                lineToRelative(80f, 0f)
                lineToRelative(-80f, -88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 176f)
                lineToRelative(0f, -168f)
                lineToRelative(-104f, 128f)
                lineToRelative(104f, 0f)
            }
        }.build()

        return _SailboatDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SailboatDuotone: ImageVector? = null
