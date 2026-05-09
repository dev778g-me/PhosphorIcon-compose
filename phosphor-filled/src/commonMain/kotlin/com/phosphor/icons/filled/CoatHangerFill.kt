package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.CoatHangerFill: ImageVector
    get() {
        if (_CoatHangerFill != null) {
            return _CoatHangerFill!!
        }
        _CoatHangerFill = ImageVector.Builder(
            name = "Filled.CoatHangerFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(241.57f, 171.2f)
                lineTo(141.33f, 96f)
                lineToRelative(23.46f, -17.6f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 72f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -80f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 47.69f, -3.78f)
                lineTo(14.43f, 171.2f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 200f)
                horizontalLineTo(232f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.6f, -28.8f)
                close()
                moveTo(32.73f, 184f)
                curveTo(53.6f, 170.59f, 89.49f, 152f, 128f, 152f)
                reflectiveCurveToRelative(74.4f, 18.59f, 95.27f, 32f)
                close()
            }
        }.build()

        return _CoatHangerFill!!
    }

@Suppress("ObjectPropertyName")
private var _CoatHangerFill: ImageVector? = null
