package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.ThermometerSimpleFill: ImageVector
    get() {
        if (_ThermometerSimpleFill != null) {
            return _ThermometerSimpleFill!!
        }
        _ThermometerSimpleFill = ImageVector.Builder(
            name = "Filled.ThermometerSimpleFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(160f, 146.08f)
                verticalLineTo(40f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -64f, 0f)
                verticalLineTo(146.08f)
                arcToRelative(56f, 56f, 0f, isMoreThanHalf = true, isPositiveArc = false, 64f, 0f)
                close()
                moveTo(128f, 24f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 16f)
                verticalLineToRelative(64f)
                horizontalLineTo(112f)
                verticalLineTo(40f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 24f)
                close()
            }
        }.build()

        return _ThermometerSimpleFill!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerSimpleFill: ImageVector? = null
