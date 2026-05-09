package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.SteamLogoDuotone: ImageVector
    get() {
        if (_SteamLogoDuotone != null) {
            return _SteamLogoDuotone!!
        }
        _SteamLogoDuotone = ImageVector.Builder(
            name = "Duotone.SteamLogoDuotone",
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
                moveTo(128f, 32f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = false, 96f, 96f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 32f)
                close()
                moveTo(173.81f, 129.61f)
                lineTo(112.72f, 179.43f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.15f, -28.15f)
                lineToRelative(49.82f, -61.09f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 39.42f, 39.42f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(156f, 108f)
                moveToRelative(-28f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 56f, 0f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, -56f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(100f, 164f)
                moveToRelative(-20f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 40f, 0f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -40f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(84.57f, 151.28f)
                lineTo(134.39f, 90.19f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(112.72f, 179.43f)
                lineTo(173.81f, 129.61f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(85.86f, 149.86f)
                lineTo(36.11f, 100.11f)
            }
        }.build()

        return _SteamLogoDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _SteamLogoDuotone: ImageVector? = null
