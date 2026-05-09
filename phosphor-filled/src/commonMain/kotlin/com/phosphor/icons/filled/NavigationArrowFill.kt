package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.NavigationArrowFill: ImageVector
    get() {
        if (_NavigationArrowFill != null) {
            return _NavigationArrowFill!!
        }
        _NavigationArrowFill = ImageVector.Builder(
            name = "Filled.NavigationArrowFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(248f, 121.58f)
                arcToRelative(15.76f, 15.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.29f, 15f)
                lineToRelative(-0.2f, 0.06f)
                lineToRelative(-78f, 21.84f)
                lineToRelative(-21.84f, 78f)
                lineToRelative(-0.06f, 0.2f)
                arcToRelative(15.77f, 15.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15f, 11.29f)
                horizontalLineToRelative(-0.3f)
                arcToRelative(15.77f, 15.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, -15.07f, -10.67f)
                lineTo(41f, 61.41f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.05f, -0.16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 61.25f, 40.9f)
                lineToRelative(0.16f, 0.05f)
                lineToRelative(175.92f, 65.26f)
                arcTo(15.78f, 15.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 248f, 121.58f)
                close()
            }
        }.build()

        return _NavigationArrowFill!!
    }

@Suppress("ObjectPropertyName")
private var _NavigationArrowFill: ImageVector? = null
