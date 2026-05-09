package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.RocketLaunchFill: ImageVector
    get() {
        if (_RocketLaunchFill != null) {
            return _RocketLaunchFill!!
        }
        _RocketLaunchFill = ImageVector.Builder(
            name = "Filled.RocketLaunchFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(101.85f, 191.14f)
                curveTo(97.34f, 201f, 82.29f, 224f, 40f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                curveToRelative(0f, -42.29f, 23f, -57.34f, 32.86f, -61.85f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.64f, 14.56f)
                curveToRelative(-6.43f, 2.93f, -20.62f, 12.36f, -23.12f, 38.91f)
                curveToRelative(26.55f, -2.5f, 36f, -16.69f, 38.91f, -23.12f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 14.56f, 6.64f)
                close()
                moveTo(223.85f, 47.14f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15f, -15f)
                curveToRelative(-12.58f, -0.75f, -44.73f, 0.4f, -71.4f, 27.07f)
                horizontalLineToRelative(0f)
                lineTo(88f, 108.7f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76.67f, 97.39f)
                lineToRelative(26.56f, -26.57f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 100.41f, 64f)
                lineTo(74.35f, 64f)
                arcTo(15.9f, 15.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 63f, 68.68f)
                lineTo(28.7f, 103f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.07f, 27.16f)
                lineToRelative(38.47f, 5.37f)
                lineToRelative(44.21f, 44.21f)
                lineToRelative(5.37f, 38.49f)
                arcToRelative(15.94f, 15.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.78f, 12.92f)
                arcToRelative(16.11f, 16.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.1f, 0.83f)
                arcTo(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 153f, 227.3f)
                lineTo(187.32f, 193f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 181.65f)
                lineTo(192f, 155.59f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.83f, -2.82f)
                lineToRelative(-26.57f, 26.56f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.71f, -0.42f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.6f, -11.1f)
                lineToRelative(49.27f, -49.27f)
                horizontalLineToRelative(0f)
                curveTo(223.45f, 91.86f, 224.6f, 59.71f, 223.85f, 47.12f)
                close()
            }
        }.build()

        return _RocketLaunchFill!!
    }

@Suppress("ObjectPropertyName")
private var _RocketLaunchFill: ImageVector? = null
