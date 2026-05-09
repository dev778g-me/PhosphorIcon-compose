package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.AlignCenterHorizontalSimpleThin: ImageVector
    get() {
        if (_AlignCenterHorizontalSimpleThin != null) {
            return _AlignCenterHorizontalSimpleThin!!
        }
        _AlignCenterHorizontalSimpleThin = ImageVector.Builder(
            name = "Thin.AlignCenterHorizontalSimpleThin",
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
                moveTo(128f, 48f)
                lineTo(128f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 168f)
                lineTo(128f, 208f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 88f)
                lineTo(208f, 88f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 96f)
                lineTo(216f, 160f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 168f)
                lineTo(48f, 168f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 160f)
                lineTo(40f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 88f)
                close()
            }
        }.build()

        return _AlignCenterHorizontalSimpleThin!!
    }

@Suppress("ObjectPropertyName")
private var _AlignCenterHorizontalSimpleThin: ImageVector? = null
