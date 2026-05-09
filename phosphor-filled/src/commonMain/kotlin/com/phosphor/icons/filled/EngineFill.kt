package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.EngineFill: ImageVector
    get() {
        if (_EngineFill != null) {
            return _EngineFill!!
        }
        _EngineFill = ImageVector.Builder(
            name = "Filled.EngineFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(256f, 120f)
                verticalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 16f)
                horizontalLineTo(227.31f)
                lineTo(192f, 219.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180.69f, 224f)
                horizontalLineTo(103.31f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 92f, 219.31f)
                lineTo(52.69f, 180f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 168.69f)
                verticalLineTo(148f)
                horizontalLineTo(24f)
                verticalLineToRelative(24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, 0f)
                verticalLineTo(108f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                verticalLineToRelative(24f)
                horizontalLineTo(48f)
                verticalLineTo(80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 64f)
                horizontalLineToRelative(60f)
                verticalLineTo(40f)
                horizontalLineTo(100f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -16f)
                horizontalLineToRelative(64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
                horizontalLineTo(140f)
                verticalLineTo(64f)
                horizontalLineToRelative(40.69f)
                arcTo(15.86f, 15.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 68.69f)
                lineTo(227.31f, 104f)
                horizontalLineTo(240f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 256f, 120f)
                close()
            }
        }.build()

        return _EngineFill!!
    }

@Suppress("ObjectPropertyName")
private var _EngineFill: ImageVector? = null
