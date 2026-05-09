package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SelectionInverseFill: ImageVector
    get() {
        if (_SelectionInverseFill != null) {
            return _SelectionInverseFill!!
        }
        _SelectionInverseFill = ImageVector.Builder(
            name = "Filled.SelectionInverseFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(112f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152f, 216f)
                close()
                moveTo(40f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(48f, 112f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 152f)
                close()
                moveTo(72f, 208f)
                lineTo(48f, 208f)
                lineTo(48f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 0f)
                verticalLineToRelative(24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                lineTo(72f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(224f, 48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(48f, 32f)
                arcToRelative(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.66f, 4.11f)
                arcToRelative(7.67f, 7.67f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.23f, 1.23f)
                arcTo(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 48f)
                lineTo(32f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(48f, 59.31f)
                lineTo(196.69f, 208f)
                lineTo(184f, 208f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(24f)
                arcToRelative(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.66f, -4.1f)
                arcToRelative(7.35f, 7.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.65f, -0.59f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.58f, -0.65f)
                arcTo(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 208f)
                close()
            }
        }.build()

        return _SelectionInverseFill!!
    }

@Suppress("ObjectPropertyName")
private var _SelectionInverseFill: ImageVector? = null
