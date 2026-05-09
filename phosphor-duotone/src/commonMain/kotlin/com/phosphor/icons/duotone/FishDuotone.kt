package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.FishDuotone: ImageVector
    get() {
        if (_FishDuotone != null) {
            return _FishDuotone!!
        }
        _FishDuotone = ImageVector.Builder(
            name = "Duotone.FishDuotone",
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
                moveTo(148.89f, 155.11f)
                arcTo(43.91f, 43.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136.2f, 119.8f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.38f, 70.22f)
                curveToRelative(-13.9f, 18f, -23.41f, 44.16f, -24.31f, 81.65f)
                lineTo(8f, 175.87f)
                lineToRelative(56.07f, 16.06f)
                lineToRelative(16f, 56.07f)
                lineToRelative(24f, -56.07f)
                curveToRelative(37.51f, -0.9f, 63.64f, -10.41f, 81.68f, -24.31f)
                arcTo(43.92f, 43.92f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148.89f, 155.11f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(156f, 76f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 175.87f)
                lineToRelative(56.07f, 16.06f)
                lineToRelative(16f, 56.07f)
                lineToRelative(24f, -56.07f)
                curveTo(258.51f, 188.26f, 220f, 38.68f, 219f, 37f)
                curveToRelative(-1.73f, -1f, -151.25f, -39.46f, -155f, 114.9f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(185.82f, 167.62f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136.2f, 119.8f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88.38f, 70.21f)
            }
        }.build()

        return _FishDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _FishDuotone: ImageVector? = null
