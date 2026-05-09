package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FunnelFill: ImageVector
    get() {
        if (_FunnelFill != null) {
            return _FunnelFill!!
        }
        _FunnelFill = ImageVector.Builder(
            name = "Filled.FunnelFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.81f, 66.76f)
                lineToRelative(-0.08f, 0.09f)
                lineTo(160f, 139.17f)
                verticalLineToRelative(55.49f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 152.87f, 208f)
                lineToRelative(-32f, 21.34f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 96f, 216f)
                verticalLineTo(139.17f)
                lineTo(28.27f, 66.85f)
                lineToRelative(-0.08f, -0.09f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 40f)
                horizontalLineTo(216f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.84f, 26.76f)
                close()
            }
        }.build()

        return _FunnelFill!!
    }

@Suppress("ObjectPropertyName")
private var _FunnelFill: ImageVector? = null
