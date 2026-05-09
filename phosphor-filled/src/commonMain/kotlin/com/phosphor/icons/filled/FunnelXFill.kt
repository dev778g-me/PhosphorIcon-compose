package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FunnelXFill: ImageVector
    get() {
        if (_FunnelXFill != null) {
            return _FunnelXFill!!
        }
        _FunnelXFill = ImageVector.Builder(
            name = "Filled.FunnelXFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(227.73f, 66.85f)
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
                moveTo(227.31f, 192f)
                lineToRelative(18.35f, -18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, -11.32f)
                lineTo(216f, 180.69f)
                lineToRelative(-18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.32f, 11.32f)
                lineTo(204.69f, 192f)
                lineToRelative(-18.35f, 18.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 11.32f)
                lineTo(216f, 203.31f)
                lineToRelative(18.34f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, -11.32f)
                close()
            }
        }.build()

        return _FunnelXFill!!
    }

@Suppress("ObjectPropertyName")
private var _FunnelXFill: ImageVector? = null
