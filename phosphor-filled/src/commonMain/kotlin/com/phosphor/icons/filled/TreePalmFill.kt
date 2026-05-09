package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.TreePalmFill: ImageVector
    get() {
        if (_TreePalmFill != null) {
            return _TreePalmFill!!
        }
        _TreePalmFill = ImageVector.Builder(
            name = "Filled.TreePalmFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.84f, 60.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.65f, 5.75f)
                lineTo(179f, 90.55f)
                arcToRelative(71.42f, 71.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 43.36f, 33.21f)
                arcToRelative(70.64f, 70.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, 54.32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 217f, 182.36f)
                lineToRelative(-81f, -61.68f)
                verticalLineTo(224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(120.68f)
                lineTo(39f, 182.36f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -12.57f, -4.28f)
                arcToRelative(70.64f, 70.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.2f, -54.32f)
                arcTo(71.42f, 71.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77f, 90.55f)
                lineTo(20.81f, 66.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.6f, -12.85f)
                arcToRelative(66.86f, 66.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.74f, 0f)
                arcToRelative(72.21f, 72.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                arcToRelative(72.21f, 72.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.05f, -17f)
                arcToRelative(66.86f, 66.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 97.74f, 0f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 239.84f, 60.33f)
                close()
            }
        }.build()

        return _TreePalmFill!!
    }

@Suppress("ObjectPropertyName")
private var _TreePalmFill: ImageVector? = null
