package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PersonArmsSpreadFill: ImageVector
    get() {
        if (_PersonArmsSpreadFill != null) {
            return _PersonArmsSpreadFill!!
        }
        _PersonArmsSpreadFill = ImageVector.Builder(
            name = "Filled.PersonArmsSpreadFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(100f, 36f)
                arcToRelative(28f, 28f, 0f, isMoreThanHalf = true, isPositiveArc = true, 28f, 28f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = true, 100f, 36f)
                close()
                moveTo(227.6f, 92.57f)
                arcTo(15.7f, 15.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 212f, 80f)
                horizontalLineTo(44f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.7f, 30.53f)
                lineToRelative(0.06f, 0f)
                lineToRelative(53.89f, 23.73f)
                lineToRelative(-21.92f, 83.3f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.9f, 20.91f)
                arcTo(15.83f, 15.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, 84f, 240f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.44f, -9.06f)
                lineTo(128f, 180f)
                lineToRelative(29.58f, 51f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 29.07f, -13.35f)
                lineToRelative(-21.92f, -83.3f)
                lineToRelative(54f, -23.76f)
                arcTo(15.7f, 15.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, 227.6f, 92.57f)
                close()
            }
        }.build()

        return _PersonArmsSpreadFill!!
    }

@Suppress("ObjectPropertyName")
private var _PersonArmsSpreadFill: ImageVector? = null
