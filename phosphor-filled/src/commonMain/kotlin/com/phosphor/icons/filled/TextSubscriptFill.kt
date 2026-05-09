package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TextSubscriptFill: ImageVector
    get() {
        if (_TextSubscriptFill != null) {
            return _TextSubscriptFill!!
        }
        _TextSubscriptFill = ImageVector.Builder(
            name = "Filled.TextSubscriptFill",
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
                moveTo(126.55f, 147.41f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.1f, 9.18f)
                lineTo(92f, 126f)
                lineTo(70.55f, 156.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -13.1f, -9.18f)
                lineTo(82.23f, 112f)
                lineTo(57.45f, 76.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.1f, -9.18f)
                lineTo(92f, 98.05f)
                lineToRelative(21.45f, -30.64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.1f, 9.18f)
                lineTo(101.77f, 112f)
                close()
                moveTo(192f, 192f)
                horizontalLineTo(152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.4f, -12.8f)
                lineToRelative(36f, -48f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, -19.15f, -14.46f)
                arcToRelative(13.06f, 13.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.58f, 4.81f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -15.68f, -3.18f)
                arcToRelative(28.17f, 28.17f, 0f, isMoreThanHalf = true, isPositiveArc = true, 50.2f, 22.44f)
                lineTo(168f, 176f)
                horizontalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _TextSubscriptFill!!
    }

@Suppress("ObjectPropertyName")
private var _TextSubscriptFill: ImageVector? = null
