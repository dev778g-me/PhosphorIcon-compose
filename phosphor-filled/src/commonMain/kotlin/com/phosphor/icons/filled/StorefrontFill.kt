package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.StorefrontFill: ImageVector
    get() {
        if (_StorefrontFill != null) {
            return _StorefrontFill!!
        }
        _StorefrontFill = ImageVector.Builder(
            name = "Filled.StorefrontFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(231.69f, 93.81f)
                lineTo(217.35f, 43.6f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 202f, 32f)
                lineTo(54f, 32f)
                arcTo(16.07f, 16.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 38.65f, 43.6f)
                lineTo(24.31f, 93.81f)
                arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 96f)
                verticalLineToRelative(16f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 32f)
                verticalLineToRelative(72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                lineTo(208f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                lineTo(216f, 144f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -32f)
                lineTo(232f, 96f)
                arcTo(7.94f, 7.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 231.69f, 93.81f)
                close()
                moveTo(88f, 112f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -35.12f, 21.26f)
                arcToRelative(7.88f, 7.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.82f, -1.06f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 112f)
                verticalLineToRelative(-8f)
                lineTo(88f, 104f)
                close()
                moveTo(152f, 112f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(48f)
                close()
                moveTo(216f, 112f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.07f, 20.2f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, 1.05f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 168f, 112f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(48f)
                close()
            }
        }.build()

        return _StorefrontFill!!
    }

@Suppress("ObjectPropertyName")
private var _StorefrontFill: ImageVector? = null
