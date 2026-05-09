package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.DeviceMobileSpeakerFill: ImageVector
    get() {
        if (_DeviceMobileSpeakerFill != null) {
            return _DeviceMobileSpeakerFill!!
        }
        _DeviceMobileSpeakerFill = ImageVector.Builder(
            name = "Filled.DeviceMobileSpeakerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(176f, 16f)
                horizontalLineTo(80f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 56f, 40f)
                verticalLineTo(216f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 24f)
                horizontalLineToRelative(96f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, -24f)
                verticalLineTo(40f)
                arcTo(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176f, 16f)
                close()
                moveTo(160f, 64f)
                horizontalLineTo(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _DeviceMobileSpeakerFill!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMobileSpeakerFill: ImageVector? = null
