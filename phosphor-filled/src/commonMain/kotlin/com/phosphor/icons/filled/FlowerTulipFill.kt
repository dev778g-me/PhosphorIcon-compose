package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FlowerTulipFill: ImageVector
    get() {
        if (_FlowerTulipFill != null) {
            return _FlowerTulipFill!!
        }
        _FlowerTulipFill = ImageVector.Builder(
            name = "Filled.FlowerTulipFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(208f, 48f)
                arcToRelative(87.48f, 87.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -35.36f, 7.43f)
                curveToRelative(-15.1f, -25.37f, -39.92f, -38f, -41.06f, -38.59f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, 0f)
                curveToRelative(-1.14f, 0.58f, -26f, 13.22f, -41.06f, 38.59f)
                arcTo(87.48f, 87.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 48f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                lineTo(40f, 96f)
                arcToRelative(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 87.63f)
                verticalLineToRelative(35.43f)
                lineTo(83.58f, 200.84f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = false, -7.16f, 14.32f)
                lineToRelative(48f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.16f, 0f)
                lineToRelative(48f, -24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.16f, -14.32f)
                lineTo(136f, 219.06f)
                lineTo(136f, 183.63f)
                arcTo(88.11f, 88.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 96f)
                lineTo(216f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 48f)
                close()
                moveTo(56f, 96f)
                lineTo(56f, 64.44f)
                arcTo(72.1f, 72.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 120f, 136f)
                verticalLineToRelative(31.56f)
                arcTo(72.1f, 72.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 56f, 96f)
                close()
                moveTo(200f, 96f)
                arcToRelative(72.1f, 72.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -64f, 71.56f)
                lineTo(136f, 136f)
                arcToRelative(72.1f, 72.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, -71.56f)
                close()
            }
        }.build()

        return _FlowerTulipFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlowerTulipFill: ImageVector? = null
