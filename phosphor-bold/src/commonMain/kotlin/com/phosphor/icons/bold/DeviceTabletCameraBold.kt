package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.DeviceTabletCameraBold: ImageVector
    get() {
        if (_DeviceTabletCameraBold != null) {
            return _DeviceTabletCameraBold!!
        }
        _DeviceTabletCameraBold = ImageVector.Builder(
            name = "Bold.DeviceTabletCameraBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(208f, 48f)
                lineTo(208f, 208f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 224f)
                lineTo(64f, 224f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 208f)
                lineTo(48f, 48f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 32f)
                lineTo(192f, 32f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 76f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
        }.build()

        return _DeviceTabletCameraBold!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceTabletCameraBold: ImageVector? = null
