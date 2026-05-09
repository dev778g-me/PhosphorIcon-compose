package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TennisBallFill: ImageVector
    get() {
        if (_TennisBallFill != null) {
            return _TennisBallFill!!
        }
        _TennisBallFill = ImageVector.Builder(
            name = "Filled.TennisBallFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.81f, 115.41f)
                arcToRelative(103.9f, 103.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 90.6f, -90.65f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.47f, 3.79f)
                arcToRelative(87.82f, 87.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -91.27f, 91.33f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24.81f, 115.41f)
                close()
                moveTo(227.35f, 136.11f)
                curveToRelative(-1.12f, 0f, -2.23f, -0.07f, -3.35f, -0.07f)
                arcToRelative(87.84f, 87.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, -87.88f, 91.41f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.47f, 3.79f)
                arcToRelative(103.9f, 103.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.6f, -90.66f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.35f, 136.11f)
                close()
                moveTo(150.46f, 150.46f)
                arcTo(103.33f, 103.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 120f)
                curveToRelative(1f, 0f, 2.06f, 0f, 3.09f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.12f, -4.43f)
                arcToRelative(103.91f, 103.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -90.88f, -90.89f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.43f, 4.12f)
                arcToRelative(103.72f, 103.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, -30.36f, 76.7f)
                arcTo(103.33f, 103.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 136f)
                curveToRelative(-1f, 0f, -2.06f, 0f, -3.09f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.12f, 4.43f)
                arcToRelative(103.91f, 103.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 90.88f, 90.89f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.43f, -4.12f)
                arcTo(103.72f, 103.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 150.46f, 150.46f)
                close()
            }
        }.build()

        return _TennisBallFill!!
    }

@Suppress("ObjectPropertyName")
private var _TennisBallFill: ImageVector? = null
