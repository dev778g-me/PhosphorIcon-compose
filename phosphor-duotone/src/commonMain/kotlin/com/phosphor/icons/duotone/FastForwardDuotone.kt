package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FastForwardDuotone: ImageVector
    get() {
        if (_FastForwardDuotone != null) {
            return _FastForwardDuotone!!
        }
        _FastForwardDuotone = ImageVector.Builder(
            name = "Duotone.FastForwardDuotone",
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
                moveTo(40f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                lineTo(52.18f, 65.26f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 71.85f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(144f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                lineTo(156.18f, 65.26f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 71.85f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                lineTo(52.18f, 65.26f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 71.85f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(144f, 71.85f)
                verticalLineToRelative(112.3f)
                arcToRelative(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.18f, 6.59f)
                lineToRelative(88.19f, -56.15f)
                arcToRelative(7.8f, 7.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -13.18f)
                lineTo(156.18f, 65.26f)
                arcTo(7.91f, 7.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 71.85f)
                close()
            }
        }.build()

        return _FastForwardDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardDuotone: ImageVector? = null
