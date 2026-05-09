package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TrolleyFill: ImageVector
    get() {
        if (_TrolleyFill != null) {
            return _TrolleyFill!!
        }
        _TrolleyFill = ImageVector.Builder(
            name = "Filled.TrolleyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(88f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 88f, 224f)
                close()
                moveTo(216f, 208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 208f)
                close()
                moveTo(240f, 176f)
                lineTo(56f, 176f)
                lineTo(56f, 75.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 51.31f, 64f)
                lineTo(29.66f, 42.34f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.34f, 53.66f)
                lineTo(40f, 75.31f)
                lineTo(40f, 176f)
                lineTo(32f, 176f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(240f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(88f, 160f)
                lineTo(216f, 160f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                lineTo(232f, 80f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(88f, 64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, 80f)
                verticalLineToRelative(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 160f)
                close()
            }
        }.build()

        return _TrolleyFill!!
    }

@Suppress("ObjectPropertyName")
private var _TrolleyFill: ImageVector? = null
