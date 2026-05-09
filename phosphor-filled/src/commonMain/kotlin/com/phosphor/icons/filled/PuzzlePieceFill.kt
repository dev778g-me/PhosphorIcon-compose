package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PuzzlePieceFill: ImageVector
    get() {
        if (_PuzzlePieceFill != null) {
            return _PuzzlePieceFill!!
        }
        _PuzzlePieceFill = ImageVector.Builder(
            name = "Filled.PuzzlePieceFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(165.78f, 224f)
                horizontalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, -16f)
                verticalLineTo(170.35f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212.94f, 163f)
                arcToRelative(23.37f, 23.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.94f, 1.77f)
                curveToRelative(-13.23f, 0f, -24f, -11.1f, -24f, -24.73f)
                reflectiveCurveToRelative(10.77f, -24.73f, 24f, -24.73f)
                arcToRelative(23.37f, 23.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.94f, 1.77f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 109.65f)
                verticalLineTo(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                horizontalLineTo(171.78f)
                arcToRelative(35.36f, 35.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, -4f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -72f, 0f)
                arcToRelative(35.36f, 35.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.22f, 4f)
                horizontalLineTo(64f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 72f)
                verticalLineToRelative(32.22f)
                arcToRelative(35.36f, 35.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -0.22f)
                arcToRelative(36f, 36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 72f)
                arcToRelative(35.36f, 35.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -0.22f)
                verticalLineTo(208f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(42.22f)
            }
        }.build()

        return _PuzzlePieceFill!!
    }

@Suppress("ObjectPropertyName")
private var _PuzzlePieceFill: ImageVector? = null
