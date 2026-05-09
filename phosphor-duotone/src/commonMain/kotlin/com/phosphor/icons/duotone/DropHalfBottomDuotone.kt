package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.DropHalfBottomDuotone: ImageVector
    get() {
        if (_DropHalfBottomDuotone != null) {
            return _DropHalfBottomDuotone!!
        }
        _DropHalfBottomDuotone = ImageVector.Builder(
            name = "Duotone.DropHalfBottomDuotone",
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
                moveTo(49.3f, 128f)
                arcTo(100.8f, 100.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 144f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
                arcToRelative(100.8f, 100.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, -16f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 144f)
                curveToRelative(0f, -72f, -80f, -128f, -80f, -128f)
                reflectiveCurveTo(48f, 72f, 48f, 144f)
                arcToRelative(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(49.3f, 128f)
                lineTo(206.7f, 128f)
            }
        }.build()

        return _DropHalfBottomDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DropHalfBottomDuotone: ImageVector? = null
