package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.BuildingsFill: ImageVector
    get() {
        if (_BuildingsFill != null) {
            return _BuildingsFill!!
        }
        _BuildingsFill = ImageVector.Builder(
            name = "Filled.BuildingsFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(239.73f, 208f)
                lineTo(224f, 208f)
                lineTo(224f, 96f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(164f, 80f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                lineTo(160f, 208f)
                lineTo(144f, 208f)
                lineTo(144f, 32.41f)
                arcToRelative(16.43f, 16.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.16f, -13f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -18.72f, -0.69f)
                lineTo(39.12f, 72f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32f, 85.34f)
                lineTo(32f, 208f)
                lineTo(16.27f, 208f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 215.47f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 224f)
                lineTo(240f, 224f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8.53f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 239.73f, 208f)
                close()
                moveTo(76f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, 8f)
                arcTo(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 183.72f)
                lineTo(60f, 168.27f)
                arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.47f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 168f)
                close()
                moveTo(76f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, 8f)
                arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 60f, 127.72f)
                lineTo(60f, 112.27f)
                arcTo(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 67.47f, 104f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 76f, 112f)
                close()
                moveTo(116f, 184f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, 8f)
                arcToRelative(8.18f, 8.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, -8.26f)
                lineTo(100f, 168.27f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, 8f)
                close()
                moveTo(116f, 128f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8.53f, 8f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.47f, -8.26f)
                lineTo(100f, 112.27f)
                arcToRelative(8.19f, 8.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.47f, -8.26f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.53f, 8f)
                close()
            }
        }.build()

        return _BuildingsFill!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingsFill: ImageVector? = null
