package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FlagCheckeredFill: ImageVector
    get() {
        if (_FlagCheckeredFill != null) {
            return _FlagCheckeredFill!!
        }
        _FlagCheckeredFill = ImageVector.Builder(
            name = "Filled.FlagCheckeredFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.32f, 48.75f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 218.76f, 50f)
                curveToRelative(-28f, 24.22f, -51.72f, 12.48f, -79.21f, -1.13f)
                curveTo(111.07f, 34.76f, 78.78f, 18.79f, 42.76f, 50f)
                horizontalLineToRelative(0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 56f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                verticalLineTo(179.77f)
                curveToRelative(26.79f, -21.16f, 49.87f, -9.75f, 76.45f, 3.41f)
                curveToRelative(16.4f, 8.11f, 34.06f, 16.85f, 53f, 16.85f)
                curveToRelative(13.93f, 0f, 28.54f, -4.75f, 43.82f, -18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.76f, -6f)
                verticalLineTo(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.32f, 48.75f)
                close()
                moveTo(56f, 160.44f)
                verticalLineTo(109.88f)
                curveToRelative(16.85f, -11.28f, 32.64f, -11.59f, 48f, -7.34f)
                verticalLineToRelative(51.74f)
                curveTo(88.87f, 150.47f, 72.87f, 150.71f, 56f, 160.44f)
                close()
                moveTo(104f, 50.87f)
                curveToRelative(9.25f, 2.83f, 18.61f, 7.45f, 28.45f, 12.32f)
                curveToRelative(11.26f, 5.57f, 23.11f, 11.43f, 35.55f, 14.56f)
                verticalLineToRelative(51.74f)
                curveToRelative(15.35f, 4.25f, 31.14f, 3.94f, 48f, -7.35f)
                verticalLineToRelative(50.11f)
                curveToRelative(-16.87f, 13.32f, -32.27f, 13.72f, -48f, 8.91f)
                verticalLineTo(129.49f)
                curveToRelative(-21.62f, -6f, -42.38f, -21f, -64f, -26.95f)
                close()
            }
        }.build()

        return _FlagCheckeredFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlagCheckeredFill: ImageVector? = null
