package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.HeadCircuitFill: ImageVector
    get() {
        if (_HeadCircuitFill != null) {
            return _HeadCircuitFill!!
        }
        _HeadCircuitFill = ImageVector.Builder(
            name = "Filled.HeadCircuitFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 71.95f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(152f, 135.95f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(192.5f, 171.42f)
                arcTo(88.32f, 88.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 224f, 101.89f)
                quadToRelative(0f, -1.1f, -0.09f, -2.19f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -3.75f)
                horizontalLineTo(195.75f)
                lineTo(172.62f, 123.7f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -12.28f, -10.25f)
                lineToRelative(25.51f, -30.62f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 80f)
                horizontalLineToRelative(23.14f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.77f, -5.35f)
                curveTo(207.27f, 42f, 176.86f, 18f, 140.74f, 16.08f)
                lineToRelative(-0.59f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.15f, 4f)
                verticalLineTo(49.33f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
                verticalLineToRelative(-27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.89f, -3.91f)
                arcTo(88.16f, 88.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 102f)
                lineTo(25.55f, 145.14f)
                lineToRelative(-0.22f, 0.45f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.51f, 20.7f)
                lineToRelative(0.25f, 0.12f)
                lineTo(56f, 176.9f)
                verticalLineToRelative(31f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 16f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(8f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(71.77f)
                arcToRelative(8.31f, 8.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.06f, -1f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.11f, -8f)
                close()
            }
        }.build()

        return _HeadCircuitFill!!
    }

@Suppress("ObjectPropertyName")
private var _HeadCircuitFill: ImageVector? = null
