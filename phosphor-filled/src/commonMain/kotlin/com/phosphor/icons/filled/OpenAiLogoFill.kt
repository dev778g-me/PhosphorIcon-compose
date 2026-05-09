package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.OpenAiLogoFill: ImageVector
    get() {
        if (_OpenAiLogoFill != null) {
            return _OpenAiLogoFill!!
        }
        _OpenAiLogoFill = ImageVector.Builder(
            name = "Filled.OpenAiLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224.32f, 114.24f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -60.07f, -76.57f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 67.93f, 51.44f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -36.25f, 90.32f)
                arcTo(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 69f, 217f)
                arcTo(56.39f, 56.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 83.59f, 219f)
                arcToRelative(55.75f, 55.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.17f, -0.61f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96.31f, -13.78f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 36.25f, -90.32f)
                close()
                moveTo(144f, 137.24f)
                lineTo(128f, 146.48f)
                lineTo(112f, 137.24f)
                lineTo(112f, 118.76f)
                lineToRelative(16f, -9.24f)
                lineToRelative(16f, 9.24f)
                close()
                moveTo(182.85f, 54.43f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 28.56f, 48f)
                curveToRelative(-0.95f, -0.63f, -1.91f, -1.24f, -2.91f, -1.81f)
                lineTo(164f, 74.88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                lineToRelative(-44f, 25.41f)
                lineTo(112f, 81.81f)
                lineToRelative(40.5f, -23.38f)
                arcTo(39.76f, 39.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 182.85f, 54.43f)
                close()
                moveTo(40.85f, 86.93f)
                arcTo(39.75f, 39.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64.12f, 68.57f)
                curveTo(64.05f, 69.71f, 64f, 70.85f, 64f, 72f)
                verticalLineToRelative(51.38f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6.93f)
                lineToRelative(44f, 25.4f)
                lineTo(96f, 165f)
                lineTo(55.5f, 141.57f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40.86f, 86.93f)
                close()
                moveTo(136f, 224f)
                arcToRelative(39.79f, 39.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -27.52f, -10.95f)
                curveToRelative(1f, -0.51f, 2f, -1.05f, 3f, -1.63f)
                lineTo(156f, 185.73f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -6.92f)
                lineTo(160f, 128f)
                lineToRelative(16f, 9.24f)
                lineTo(176f, 184f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 224f)
                close()
            }
        }.build()

        return _OpenAiLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _OpenAiLogoFill: ImageVector? = null
