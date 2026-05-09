package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CowFill: ImageVector
    get() {
        if (_CowFill != null) {
            return _CowFill!!
        }
        _CowFill = ImageVector.Builder(
            name = "Filled.CowFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(104f, 192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                lineTo(80f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                lineTo(96f, 184f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 104f, 192f)
                close()
                moveTo(176f, 184f)
                lineTo(160f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 16f)
                horizontalLineToRelative(16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -16f)
                close()
                moveTo(244.39f, 122.12f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 128f)
                lineTo(200f, 128f)
                verticalLineToRelative(32f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 72f)
                lineTo(80f, 232f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -72f)
                lineTo(56f, 128f)
                lineTo(24f, 128f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.31f, 109f)
                arcTo(56.13f, 56.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.22f, 64f)
                horizontalLineToRelative(1.64f)
                arcTo(55.83f, 55.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(48f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                arcToRelative(55.83f, 55.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16.86f, 40f)
                horizontalLineToRelative(1.64f)
                arcToRelative(56.13f, 56.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 54.91f, 45f)
                arcTo(15.82f, 15.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 244.39f, 122.12f)
                close()
                moveTo(144f, 124f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 144f, 124f)
                close()
                moveTo(88f, 124f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 124f)
                close()
                moveTo(56f, 112f)
                verticalLineToRelative(-8f)
                arcToRelative(39.81f, 39.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -24f)
                horizontalLineToRelative(-0.8f)
                arcTo(40.09f, 40.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 112f)
                close()
                moveTo(200f, 192f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, -24f, -24f)
                lineTo(80f, 168f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 48f)
                horizontalLineToRelative(96f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 200f, 192f)
                close()
                moveTo(232f, 112f)
                arcToRelative(40.08f, 40.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -39.2f, -32f)
                lineTo(192f, 80f)
                arcToRelative(39.81f, 39.81f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 24f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()

        return _CowFill!!
    }

@Suppress("ObjectPropertyName")
private var _CowFill: ImageVector? = null
