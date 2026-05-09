package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TextStrikethroughFill: ImageVector
    get() {
        if (_TextStrikethroughFill != null) {
            return _TextStrikethroughFill!!
        }
        _TextStrikethroughFill = ImageVector.Builder(
            name = "Filled.TextStrikethroughFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 32f)
                horizontalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 32f)
                close()
                moveTo(82.71f, 94.58f)
                curveTo(86f, 76.57f, 104.58f, 64f, 128f, 64f)
                curveToRelative(18.2f, 0f, 33.59f, 7.41f, 41.18f, 19.83f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.66f, 8.34f)
                curveTo(150.94f, 84.66f, 140.39f, 80f, 128f, 80f)
                curveToRelative(-15.3f, 0f, -27.73f, 7.33f, -29.55f, 17.42f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.59f, 104f)
                arcToRelative(7.76f, 7.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.43f, -0.13f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82.71f, 94.58f)
                close()
                moveTo(192f, 136f)
                horizontalLineTo(168.29f)
                arcTo(28.45f, 28.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 156f)
                curveToRelative(0f, 20.19f, -21.08f, 36f, -48f, 36f)
                curveToRelative(-23.89f, 0f, -43.83f, -12.78f, -47.43f, -30.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.67f, -3.2f)
                curveToRelative(2f, 9.87f, 16f, 17.6f, 31.76f, 17.6f)
                curveToRelative(17.35f, 0f, 32f, -9.16f, 32f, -20f)
                curveToRelative(0f, -9.14f, -6.76f, -14.43f, -25.72f, -20f)
                horizontalLineTo(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _TextStrikethroughFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextStrikethroughFill: ImageVector? = null
