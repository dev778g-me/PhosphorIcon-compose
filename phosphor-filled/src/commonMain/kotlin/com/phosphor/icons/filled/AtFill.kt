package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.AtFill: ImageVector
    get() {
        if (_AtFill != null) {
            return _AtFill!!
        }
        _AtFill = ImageVector.Builder(
            name = "Filled.AtFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 128f)
                curveToRelative(0f, 0.51f, 0f, 1f, 0f, 1.52f)
                curveToRelative(-0.34f, 14.26f, -5.63f, 30.48f, -28f, 30.48f)
                curveToRelative(-23.14f, 0f, -28f, -17.4f, -28f, -32f)
                verticalLineTo(88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.53f, -8f)
                arcTo(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 88.27f)
                verticalLineToRelative(4f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.73f, 64.05f)
                arcToRelative(40.19f, 40.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.38f, 5f)
                curveTo(175.48f, 168f, 185.71f, 176f, 204f, 176f)
                arcToRelative(54.81f, 54.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.22f, -0.75f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.09f, 6f)
                arcTo(104.05f, 104.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 125.91f, 232f)
                curveTo(71.13f, 230.9f, 26.2f, 186.86f, 24.08f, 132.11f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = true, 232f, 128f)
                close()
                moveTo(96f, 128f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, 32f, -32f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 128f)
                close()
            }
        }.build()

        return _AtFill!!
    }

@Suppress("ObjectPropertyName")
private var _AtFill: ImageVector? = null
