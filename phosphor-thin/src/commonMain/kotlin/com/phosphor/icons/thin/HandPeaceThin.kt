package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.HandPeaceThin: ImageVector
    get() {
        if (_HandPeaceThin != null) {
            return _HandPeaceThin!!
        }
        _HandPeaceThin = ImageVector.Builder(
            name = "Thin.HandPeaceThin",
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
                moveTo(72f, 131.6f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -39.19f)
                lineToRelative(20.81f, 4f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 39.19f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 152.72f)
                verticalLineTo(160f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 72.55f, 72f)
                curveToRelative(39.7f, -0.3f, 71.45f, -33.2f, 71.45f, -72.9f)
                verticalLineToRelative(-3.34f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -38.59f, -47.07f)
                lineTo(140f, 104.41f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 39.19f)
                lineToRelative(15.37f, 3.07f)
                arcTo(28f, 28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 152f, 179.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 172.32f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -39.19f)
                lineToRelative(10f, 2f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 39.2f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(101.37f, 96.53f)
                lineTo(88.69f, 49.18f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = true, isPositiveArc = true, 38.63f, -10.35f)
                lineToRelative(17.85f, 66.61f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(150.54f, 106.51f)
                lineToRelative(18.14f, -67.68f)
                arcToRelative(20f, 20f, 0f, isMoreThanHalf = false, isPositiveArc = true, 38.63f, 10.35f)
                lineToRelative(-19.88f, 74.19f)
            }
        }.build()

        return _HandPeaceThin!!
    }

@Suppress("ObjectPropertyName")
private var _HandPeaceThin: ImageVector? = null
