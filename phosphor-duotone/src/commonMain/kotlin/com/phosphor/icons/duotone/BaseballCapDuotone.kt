package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.BaseballCapDuotone: ImageVector
    get() {
        if (_BaseballCapDuotone != null) {
            return _BaseballCapDuotone!!
        }
        _BaseballCapDuotone = ImageVector.Builder(
            name = "Duotone.BaseballCapDuotone",
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
                moveTo(128f, 120f)
                arcToRelative(159.27f, 159.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -96f, 32f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 25.48f, 12.88f)
                curveTo(73.47f, 185.26f, 97f, 176f, 128f, 176f)
                reflectiveCurveToRelative(54.53f, 9.26f, 70.52f, 20.88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 184f)
                verticalLineTo(152f)
                arcTo(159.27f, 159.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 128f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 0f)
                verticalLineToRelative(56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -25.48f, 12.88f)
                curveTo(182.53f, 185.26f, 159f, 176f, 128f, 176f)
                reflectiveCurveToRelative(-54.53f, 9.26f, -70.52f, 20.88f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 184f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 152f)
                arcToRelative(160f, 160f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88.4f, 124.94f)
                curveTo(92.57f, 67.43f, 128f, 32f, 128f, 32f)
                reflectiveCurveToRelative(35.43f, 35.43f, 39.6f, 92.94f)
            }
        }.build()

        return _BaseballCapDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BaseballCapDuotone: ImageVector? = null
