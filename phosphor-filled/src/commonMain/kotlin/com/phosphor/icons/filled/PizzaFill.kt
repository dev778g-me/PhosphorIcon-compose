package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PizzaFill: ImageVector
    get() {
        if (_PizzaFill != null) {
            return _PizzaFill!!
        }
        _PizzaFill = ImageVector.Builder(
            name = "Filled.PizzaFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.54f, 63f)
                arcToRelative(15.91f, 15.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.25f, -9.9f)
                arcToRelative(201.49f, 201.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -208.58f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.37f, 22f)
                lineToRelative(96f, 157.27f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 27.36f, 0f)
                lineToRelative(96f, -157.27f)
                arcTo(15.82f, 15.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.54f, 63f)
                close()
                moveTo(184.44f, 131.53f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -41.38f, 67.77f)
                lineTo(128f, 224f)
                lineTo(96.5f, 172.43f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -41.35f, -67.76f)
                lineTo(48.8f, 94.26f)
                arcToRelative(152f, 152f, 0f, isMoreThanHalf = false, isPositiveArc = true, 158.39f, 0f)
                close()
            }
        }.build()

        return _PizzaFill!!
    }

@Suppress("ObjectPropertyName")
private var _PizzaFill: ImageVector? = null
