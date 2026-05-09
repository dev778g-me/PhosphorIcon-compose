package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.InfinityFill: ImageVector
    get() {
        if (_InfinityFill != null) {
            return _InfinityFill!!
        }
        _InfinityFill = ImageVector.Builder(
            name = "Filled.InfinityFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(216f, 40f)
                horizontalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 56f)
                verticalLineTo(200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 40f)
                close()
                moveTo(204.28f, 156.28f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -56.4f, 0.17f)
                lineTo(97.29f, 111.34f)
                lineTo(97f, 111f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 97f, 145f)
                curveToRelative(0.36f, -0.36f, 0.71f, -0.73f, 1f, -1.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 10.6f)
                curveToRelative(-0.55f, 0.62f, -1.13f, 1.23f, -1.71f, 1.81f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -0.17f, -56.73f)
                lineToRelative(50.58f, 45.11f)
                lineToRelative(0.33f, 0.31f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = false, 159f, 111f)
                curveToRelative(-0.36f, 0.36f, -0.7f, 0.72f, -1f, 1.1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12f, -10.59f)
                curveToRelative(0.54f, -0.62f, 1.12f, -1.24f, 1.71f, -1.82f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56.57f, 56.56f)
                close()
            }
        }.build()

        return _InfinityFill!!
    }

@Suppress("ObjectPropertyName")
private var _InfinityFill: ImageVector? = null
