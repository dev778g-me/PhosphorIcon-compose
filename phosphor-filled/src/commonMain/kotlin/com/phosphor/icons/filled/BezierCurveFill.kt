package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BezierCurveFill: ImageVector
    get() {
        if (_BezierCurveFill != null) {
            return _BezierCurveFill!!
        }
        _BezierCurveFill = ImageVector.Builder(
            name = "Filled.BezierCurveFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(221f, 144.4f)
                arcTo(96.26f, 96.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 181f, 88f)
                horizontalLineToRelative(59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(159f, 72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -62f, 0f)
                lineTo(16f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                lineTo(75f, 88f)
                arcTo(96.26f, 96.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 35f, 144.4f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 71f, 184f)
                lineTo(185f, 184f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 36f, -39.6f)
                close()
                moveTo(40f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 192f)
                close()
                moveTo(128f, 64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 64f)
                close()
                moveTo(216f, 192f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 192f)
                close()
            }
        }.build()

        return _BezierCurveFill!!
    }

@Suppress("ObjectPropertyName")
private var _BezierCurveFill: ImageVector? = null
