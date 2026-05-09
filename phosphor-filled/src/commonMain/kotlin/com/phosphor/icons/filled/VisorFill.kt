package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.VisorFill: ImageVector
    get() {
        if (_VisorFill != null) {
            return _VisorFill!!
        }
        _VisorFill = ImageVector.Builder(
            name = "Filled.VisorFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(183.05f, 56f)
                horizontalLineTo(72f)
                arcTo(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.08f, 131.4f)
                curveToRelative(1.69f, 36.69f, 31.76f, 66.79f, 68.45f, 68.52f)
                curveToRelative(15.84f, 0.72f, 32f, -5.9f, 49.38f, -20.3f)
                arcToRelative(15.87f, 15.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.24f, 0f)
                curveTo(148.72f, 188.39f, 165f, 200f, 184f, 200f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72f, -72.95f)
                curveTo(255.49f, 87.87f, 222.76f, 56f, 183.05f, 56f)
                close()
                moveTo(176f, 104f)
                horizontalLineTo(80f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                close()
            }
        }.build()

        return _VisorFill!!
    }

@Suppress("ObjectPropertyName")
private var _VisorFill: ImageVector? = null
