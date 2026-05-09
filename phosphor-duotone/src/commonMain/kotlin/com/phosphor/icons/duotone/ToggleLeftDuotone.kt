package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.ToggleLeftDuotone: ImageVector
    get() {
        if (_ToggleLeftDuotone != null) {
            return _ToggleLeftDuotone!!
        }
        _ToggleLeftDuotone = ImageVector.Builder(
            name = "Duotone.ToggleLeftDuotone",
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
                moveTo(80f, 128f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 64f)
                lineTo(176f, 64f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                lineTo(240f, 128f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 192f)
                lineTo(80f, 192f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 128f)
                lineTo(16f, 128f)
                arcTo(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 80f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 128f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
        }.build()

        return _ToggleLeftDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _ToggleLeftDuotone: ImageVector? = null
