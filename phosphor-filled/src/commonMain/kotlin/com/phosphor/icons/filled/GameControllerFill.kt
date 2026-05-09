package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.GameControllerFill: ImageVector
    get() {
        if (_GameControllerFill != null) {
            return _GameControllerFill!!
        }
        _GameControllerFill = ImageVector.Builder(
            name = "Filled.GameControllerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(247.44f, 173.75f)
                arcToRelative(0.68f, 0.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.14f)
                lineTo(231.05f, 89.44f)
                curveToRelative(0f, -0.06f, 0f, -0.12f, 0f, -0.18f)
                arcTo(60.08f, 60.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 172f, 40f)
                lineTo(83.89f, 40f)
                arcToRelative(59.88f, 59.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -59f, 49.52f)
                lineTo(8.58f, 173.61f)
                arcToRelative(0.68f, 0.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 0.14f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60.9f, 31.71f)
                lineToRelative(0.35f, -0.37f)
                lineTo(109.52f, 160f)
                horizontalLineToRelative(37f)
                lineToRelative(39.71f, 45.09f)
                curveToRelative(0.11f, 0.13f, 0.23f, 0.25f, 0.35f, 0.37f)
                arcTo(36.08f, 36.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 216f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35.43f, -42.25f)
                close()
                moveTo(104f, 112f)
                lineTo(96f, 112f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-8f)
                lineTo(72f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(8f)
                lineTo(80f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(144f, 104f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(152f, 112f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 104f)
                close()
                moveTo(228.37f, 191.47f)
                arcToRelative(19.84f, 19.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.9f, 8.23f)
                arcTo(20.09f, 20.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 198f, 194.31f)
                lineTo(167.8f, 160f)
                lineTo(172f, 160f)
                arcToRelative(60f, 60f, 0f, isMoreThanHalf = false, isPositiveArc = false, 51f, -28.38f)
                lineToRelative(8.74f, 45f)
                arcTo(19.82f, 19.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 228.37f, 191.47f)
                close()
            }
        }.build()

        return _GameControllerFill!!
    }

@Suppress("ObjectPropertyName")
private var _GameControllerFill: ImageVector? = null
