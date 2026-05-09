package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BabyCarriageFill: ImageVector
    get() {
        if (_BabyCarriageFill != null) {
            return _BabyCarriageFill!!
        }
        _BabyCarriageFill = ImageVector.Builder(
            name = "Filled.BabyCarriageFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(215.58f, 54.55f)
                arcToRelative(7.53f, 7.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.32f, -1.27f)
                arcTo(79.68f, 79.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 32f)
                horizontalLineToRelative(-8f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, 16f)
                verticalLineToRelative(56f)
                lineTo(55.2f, 104f)
                arcTo(40.07f, 40.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                arcToRelative(80.09f, 80.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 80f)
                horizontalLineToRelative(40f)
                arcTo(79.94f, 79.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.58f, 54.55f)
                close()
                moveTo(208.67f, 70.55f)
                arcTo(63.73f, 63.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 223.48f, 104f)
                lineTo(166.81f, 104f)
                close()
                moveTo(160f, 48f)
                arcToRelative(63.59f, 63.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36.69f, 11.61f)
                lineTo(152f, 95.35f)
                lineTo(152f, 48f)
                close()
                moveTo(104f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 224f)
                close()
                moveTo(208f, 224f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 224f)
                close()
            }
        }.build()

        return _BabyCarriageFill!!
    }

@Suppress("ObjectPropertyName")
private var _BabyCarriageFill: ImageVector? = null
