package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.VideoConferenceFill: ImageVector
    get() {
        if (_VideoConferenceFill != null) {
            return _VideoConferenceFill!!
        }
        _VideoConferenceFill = ImageVector.Builder(
            name = "Filled.VideoConferenceFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(204f, 88f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12f, -12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 204f, 88f)
                close()
                moveTo(192f, 156f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 156f)
                close()
                moveTo(96f, 104f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96f, 104f)
                close()
                moveTo(232f, 56f)
                lineTo(232f, 200f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                lineTo(40f, 216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -16f)
                lineTo(24f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                lineTo(216f, 40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 232f, 56f)
                close()
                moveTo(168f, 120f)
                horizontalLineToRelative(48f)
                lineTo(216f, 56f)
                lineTo(168f, 56f)
                close()
                moveTo(135.75f, 166f)
                arcToRelative(39.76f, 39.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.19f, -23.34f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -45.12f, 0f)
                arcTo(39.84f, 39.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56.25f, 166f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 4f)
                curveToRelative(2.64f, -10.25f, 13.06f, -18f, 24.25f, -18f)
                reflectiveCurveToRelative(21.62f, 7.73f, 24.25f, 18f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, 15.5f, -4f)
                close()
                moveTo(216f, 200f)
                lineTo(216f, 136f)
                lineTo(168f, 136f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(48f)
                close()
            }
        }.build()

        return _VideoConferenceFill!!
    }

@Suppress("ObjectPropertyName")
private var _VideoConferenceFill: ImageVector? = null
