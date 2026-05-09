package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.StackSimpleThin: ImageVector
    get() {
        if (_StackSimpleThin != null) {
            return _StackSimpleThin!!
        }
        _StackSimpleThin = ImageVector.Builder(
            name = "Thin.StackSimpleThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 104f)
                lineToRelative(112f, 64f)
                lineToRelative(112f, -64f)
                lineToRelative(-112f, -64f)
                lineToRelative(-112f, 64f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 144f)
                lineToRelative(112f, 64f)
                lineToRelative(112f, -64f)
            }
        }.build()

        return _StackSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _StackSimpleThin: ImageVector? = null
