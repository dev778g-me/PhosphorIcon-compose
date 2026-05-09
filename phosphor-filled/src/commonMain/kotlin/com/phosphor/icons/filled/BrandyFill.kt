package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BrandyFill: ImageVector
    get() {
        if (_BrandyFill != null) {
            return _BrandyFill!!
        }
        _BrandyFill = ImageVector.Builder(
            name = "Filled.BrandyFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(224f, 88f)
                horizontalLineToRelative(0f)
                arcToRelative(95.63f, 95.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.53f, -52.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.7f, -3.63f)
                horizontalLineTo(54.23f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.7f, 3.63f)
                arcTo(95.63f, 95.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 88f)
                horizontalLineToRelative(0f)
                arcToRelative(96.12f, 96.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 95.66f)
                verticalLineTo(216f)
                horizontalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                horizontalLineTo(136f)
                verticalLineTo(183.66f)
                arcTo(96.12f, 96.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 88f)
                close()
                moveTo(58.7f, 48f)
                horizontalLineTo(197.3f)
                arcToRelative(79.52f, 79.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.3f, 32f)
                horizontalLineTo(48.4f)
                arcTo(79.52f, 79.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 58.7f, 48f)
                close()
            }
        }.build()

        return _BrandyFill!!
    }

@Suppress("ObjectPropertyName")
private var _BrandyFill: ImageVector? = null
