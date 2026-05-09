package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FediverseLogoFill: ImageVector
    get() {
        if (_FediverseLogoFill != null) {
            return _FediverseLogoFill!!
        }
        _FediverseLogoFill = ImageVector.Builder(
            name = "Filled.FediverseLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(212f, 96f)
                arcToRelative(27.84f, 27.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.51f, 2f)
                lineTo(171f, 59.94f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 120f, 44f)
                arcToRelative(28.65f, 28.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.15f, 2.94f)
                lineTo(73.68f, 66.3f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, -28.6f, 44.83f)
                lineToRelative(1.85f, 46.38f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32.74f, 41.42f)
                lineTo(128f, 212.47f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 49.13f, -18.79f)
                lineToRelative(27.21f, -42.75f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = false, 212f, 96f)
                close()
                moveTo(71.19f, 104.36f)
                lineTo(113.72f, 129f)
                lineTo(72.26f, 161.22f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.34f, -4.35f)
                lineToRelative(-1.85f, -46.38f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 71.19f, 104.36f)
                close()
                moveTo(149.57f, 72f)
                arcToRelative(27.8f, 27.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.94f, -2f)
                lineTo(189f, 108.06f)
                arcToRelative(27.86f, 27.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.18f, 9.22f)
                lineToRelative(-46.57f, 2.22f)
                close()
                moveTo(82.09f, 173.85f)
                lineTo(124f, 141.26f)
                lineToRelative(15.94f, 47.83f)
                arcToRelative(28.2f, 28.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.6f, 8f)
                lineTo(84f, 183.53f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 82.09f, 173.85f)
                close()
                moveTo(156f, 184f)
                lineToRelative(-0.89f, 0f)
                lineToRelative(-16.18f, -48.53f)
                lineToRelative(46.65f, -2.22f)
                arcToRelative(27.94f, 27.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.28f, 9f)
                lineToRelative(-27.21f, 42.75f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 156f, 184f)
                close()
                moveTo(126.32f, 61.7f)
                arcTo(28.44f, 28.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 134f, 68.24f)
                lineToRelative(-11.3f, 47.45f)
                lineTo(79.23f, 90.52f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 84f)
                arcToRelative(28.65f, 28.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.15f, -2.94f)
                close()
            }
        }.build()

        return _FediverseLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _FediverseLogoFill: ImageVector? = null
