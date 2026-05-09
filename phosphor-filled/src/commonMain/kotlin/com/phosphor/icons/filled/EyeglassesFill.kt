package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EyeglassesFill: ImageVector
    get() {
        if (_EyeglassesFill != null) {
            return _EyeglassesFill!!
        }
        _EyeglassesFill = ImageVector.Builder(
            name = "Filled.EyeglassesFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(232f, 72f)
                verticalLineToRelative(92f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -87.81f, 4f)
                horizontalLineTo(111.81f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 164f)
                verticalLineTo(72f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 72f)
                verticalLineToRelative(58.08f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 110.32f, 152f)
                horizontalLineToRelative(35.36f)
                arcTo(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 130.08f)
                verticalLineTo(72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 72f)
                close()
            }
        }.build()

        return _EyeglassesFill!!
    }

@Suppress("ObjectPropertyName")
private var _EyeglassesFill: ImageVector? = null
