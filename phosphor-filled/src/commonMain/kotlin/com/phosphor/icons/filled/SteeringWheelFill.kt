package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.SteeringWheelFill: ImageVector
    get() {
        if (_SteeringWheelFill != null) {
            return _SteeringWheelFill!!
        }
        _SteeringWheelFill = ImageVector.Builder(
            name = "Filled.SteeringWheelFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 24f)
                arcTo(104f, 104f, 0f, isMoreThanHalf = true, isPositiveArc = false, 232f, 128f)
                arcTo(104.11f, 104.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 24f)
                close()
                moveTo(49.63f, 168f)
                lineTo(90.45f, 168f)
                lineToRelative(17f, 45.58f)
                arcTo(88.35f, 88.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, 49.63f, 168f)
                close()
                moveTo(128f, 156f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, -16f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 156f)
                close()
                moveTo(148.46f, 213.59f)
                lineTo(165.55f, 168f)
                horizontalLineToRelative(40.82f)
                arcTo(88.34f, 88.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, 148.46f, 213.59f)
                close()
                moveTo(128f, 96f)
                arcToRelative(136.38f, 136.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, -88f, 32.33f)
                lineTo(40f, 128f)
                arcToRelative(88f, 88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 176f, 0f)
                verticalLineToRelative(0.33f)
                arcTo(136.38f, 136.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 96f)
                close()
            }
        }.build()

        return _SteeringWheelFill!!
    }

@Suppress("ObjectPropertyName")
private var _SteeringWheelFill: ImageVector? = null
