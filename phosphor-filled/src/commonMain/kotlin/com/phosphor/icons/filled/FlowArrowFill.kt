package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.FlowArrowFill: ImageVector
    get() {
        if (_FlowArrowFill != null) {
            return _FlowArrowFill!!
        }
        _FlowArrowFill = ImageVector.Builder(
            name = "Filled.FlowArrowFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(245.66f, 85.66f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(220.69f, 88f)
                horizontalLineTo(208f)
                curveToRelative(-38.67f, 0f, -46.59f, 19f, -56.62f, 43.08f)
                curveTo(141.05f, 155.88f, 129.33f, 184f, 80f, 184f)
                horizontalLineTo(79f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(1f)
                curveToRelative(38.67f, 0f, 46.59f, -19f, 56.62f, -43.08f)
                curveTo(147f, 100.12f, 158.67f, 72f, 208f, 72f)
                horizontalLineToRelative(12.69f)
                lineTo(202.34f, 53.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(32f, 32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 245.66f, 85.66f)
                close()
            }
        }.build()

        return _FlowArrowFill!!
    }

@Suppress("ObjectPropertyName")
private var _FlowArrowFill: ImageVector? = null
