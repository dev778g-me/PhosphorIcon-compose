package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.UmbrellaDuotone: ImageVector
    get() {
        if (_UmbrellaDuotone != null) {
            return _UmbrellaDuotone!!
        }
        _UmbrellaDuotone = ImageVector.Builder(
            name = "Duotone.UmbrellaDuotone",
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
                moveTo(88f, 136f)
                curveToRelative(0f, -72f, 40f, -104f, 40f, -104f)
                arcTo(104.21f, 104.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 127.29f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 136f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(128f, 32f)
                reflectiveCurveToRelative(40f, 32f, 40f, 104f)
                horizontalLineToRelative(56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.71f)
                arcTo(104.21f, 104.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 200f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                verticalLineTo(136f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 136f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8.71f)
                arcToRelative(104.37f, 104.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 207.94f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8.71f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 136f)
                curveToRelative(0f, -72f, 40f, -104f, 40f, -104f)
                reflectiveCurveToRelative(40f, 32f, 40f, 104f)
            }
        }.build()

        return _UmbrellaDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _UmbrellaDuotone: ImageVector? = null
