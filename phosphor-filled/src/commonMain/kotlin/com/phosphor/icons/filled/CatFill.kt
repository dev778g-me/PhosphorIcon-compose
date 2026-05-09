package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CatFill: ImageVector
    get() {
        if (_CatFill != null) {
            return _CatFill!!
        }
        _CatFill = ImageVector.Builder(
            name = "Filled.CatFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(222.83f, 33.54f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.14f, 3.15f)
                curveToRelative(-0.14f, 0.14f, -0.26f, 0.27f, -0.38f, 0.41f)
                lineTo(187.05f, 57f)
                arcTo(111.28f, 111.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 69f, 57f)
                lineTo(51.69f, 37.1f)
                curveToRelative(-0.12f, -0.14f, -0.24f, -0.27f, -0.38f, -0.41f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.14f, -3.15f)
                arcTo(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 48.46f)
                lineTo(24f, 136f)
                curveToRelative(0f, 49f, 40.06f, 89.63f, 91.56f, 95.32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.44f, -4f)
                verticalLineToRelative(-32f)
                lineToRelative(-13.42f, -13.43f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, -11.37f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.49f, -0.18f)
                lineTo(128f, 180.68f)
                lineToRelative(10.34f, -10.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.49f, 0.18f)
                arcToRelative(8.22f, 8.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.41f, 11.37f)
                lineTo(136f, 195.31f)
                verticalLineToRelative(32f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.44f, 4f)
                curveTo(191.94f, 225.62f, 232f, 185f, 232f, 136f)
                lineTo(232f, 48.46f)
                arcTo(16.4f, 16.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 222.83f, 33.54f)
                close()
                moveTo(84f, 152f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 84f, 152f)
                close()
                moveTo(104f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                lineTo(88f, 69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(136f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                lineTo(120f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(152f, 88f)
                lineTo(152f, 69f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                lineTo(168f, 88f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                close()
                moveTo(172f, 152f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 172f, 152f)
                close()
            }
        }.build()

        return _CatFill!!
    }

@Suppress("ObjectPropertyName")
private var _CatFill: ImageVector? = null
