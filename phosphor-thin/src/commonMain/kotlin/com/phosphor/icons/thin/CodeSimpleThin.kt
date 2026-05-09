package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.CodeSimpleThin: ImageVector
    get() {
        if (_CodeSimpleThin != null) {
            return _CodeSimpleThin!!
        }
        _CodeSimpleThin = ImageVector.Builder(
            name = "Thin.CodeSimpleThin",
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
                moveTo(88f, 64f)
                lineToRelative(-72f, 64f)
                lineToRelative(72f, 64f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 64f)
                lineToRelative(72f, 64f)
                lineToRelative(-72f, 64f)
            }
        }.build()

        return _CodeSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _CodeSimpleThin: ImageVector? = null
