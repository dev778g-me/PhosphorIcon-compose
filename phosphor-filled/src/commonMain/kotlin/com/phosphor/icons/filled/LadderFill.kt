package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.LadderFill: ImageVector
    get() {
        if (_LadderFill != null) {
            return _LadderFill!!
        }
        _LadderFill = ImageVector.Builder(
            name = "Filled.LadderFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(215.52f, 213.26f)
                lineTo(164.51f, 73f)
                lineToRelative(9.09f, -25f)
                lineTo(184f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                lineTo(88f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(4.58f)
                lineTo(32.48f, 213.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, 10.26f)
                arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, -5.27f)
                lineTo(57.24f, 192f)
                horizontalLineToRelative(47f)
                lineToRelative(-7.74f, 21.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.79f, 10.26f)
                arcTo(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 104f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.52f, -5.27f)
                lineTo(130f, 168f)
                lineTo(182f, 168f)
                lineToRelative(18.45f, 50.73f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 224f)
                arcToRelative(8.14f, 8.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, -0.48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 215.52f, 213.26f)
                close()
                moveTo(109.39f, 64f)
                horizontalLineToRelative(30f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                lineTo(109.39f, 80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -16f)
                close()
                moveTo(110.25f, 160f)
                lineTo(80.3f, 160f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(30f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(124.79f, 120f)
                lineTo(94.84f, 120f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(30f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
                moveTo(135.79f, 152f)
                lineTo(156f, 96.41f)
                lineTo(176.21f, 152f)
                close()
            }
        }.build()

        return _LadderFill!!
    }

@Suppress("ObjectPropertyName")
private var _LadderFill: ImageVector? = null
